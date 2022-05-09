package empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class AccesoBdatos {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/empleados.odb");
		em = emf.createEntityManager();
	}

	public void desconectar() {
		em.close();
		emf.close();
	}

	public DepartamentoEntity buscarDepartamento(int numDepartamento) {
		return em.find(DepartamentoEntity.class, numDepartamento);
	}

	@SuppressWarnings("deprecation")
	public void imprimirDepartamento(int numDepartamento) {
		DepartamentoEntity d = buscarDepartamento(numDepartamento);
		if (d == null)
			System.out.println("No existe el Departamento " + numDepartamento);
		else {
			Set<EmpleadoEntity> empleados = d.getEmpleados();
			String datos = "Datos del departamento " + numDepartamento + ": ";
			datos += "Nombre: " + d.getNombre() + " - Localidad: " + d.getLocalidad() + "\n";
			if (empleados.isEmpty())
				datos += "No tiene empleados en este momento";
			else {
				datos += "Lista de empleados" + "\n";
				datos += "*******************";
			}
			for (EmpleadoEntity empleado : empleados) {
				datos += "\nNúmero de empleado: " + empleado.getEmpnoId() + "\n";
				datos += "Nombre: " + empleado.getNombre() + "\n";
				datos += "Oficio: " + empleado.getOficio() + "\n";
				if (empleado.getDirId() == null)
					datos += "Jefe: No tiene" + "\n";
				else
					datos += "Jefe: " + empleado.getDirId().getNombre() + "\n";
				datos += "Año de alta: " + (empleado.getAlta().getYear() + 1900) + "\n";
				datos += "Salario: " + empleado.getSalario() + "\n";
				if (empleado.getComision() == null)
					datos += "Comisión: No tiene" + "\n";
				else
					datos += "Comisión: " + empleado.getComision() + "\n";
			}

			System.out.println(datos);
		}
	}

	public boolean insertarDepartamento(DepartamentoEntity d) {
		if (buscarDepartamento(d.getDptoId()) != null)
			return false;
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return true;
	}

	public boolean modificarDepartamento(DepartamentoEntity d) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(d.getDptoId());
		if (departamentoBuscado == null)
			return false;
		em.getTransaction().begin();
		departamentoBuscado.setNombre(d.getNombre());
		departamentoBuscado.setLocalidad(d.getLocalidad());
		em.persist(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	}

	public boolean borrarDepartamento(int numDepartamento) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(numDepartamento);
		if (departamentoBuscado == null || !departamentoBuscado.getEmpleados().isEmpty())
			return false;
		em.getTransaction().begin();
		em.remove(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento

	public void demoJPQL() {

		Query q1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d");
		System.out.println("Total Departamentos: " + q1.getSingleResult());
		System.out.println();
		TypedQuery<Long> tq1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d", Long.class);
		System.out.println("Total Departamentos: " + tq1.getSingleResult());
		System.out.println();
		TypedQuery<DepartamentoEntity> tq2 = em.createQuery("SELECT d FROM DepartamentoEntity d",
				DepartamentoEntity.class);
		List<DepartamentoEntity> l2 = tq2.getResultList();
		for (DepartamentoEntity r2 : l2) {
			System.out.println("Nombre :  " + r2.getNombre() + ", Localidad: " + r2.getLocalidad());
		}
		System.out.println();
		TypedQuery<Object[]> tq3 = em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity  d",
				Object[].class);
		List<Object[]> l3 = tq3.getResultList();
		for (Object[] r3 : l3) {
			System.out.println("Nombre :  " + r3[0] + ", Localidad: " + r3[1]);
		}
		System.out.println();
		TypedQuery<Object[]> tq4 = em.createQuery(
				"SELECT d.nombre, d.localidad FROM DepartamentoEntity d" + " WHERE d.dptoId != :n", Object[].class);
		tq4.setParameter("n", 10);
		List<Object[]> l4 = tq4.getResultList();
		for (Object[] r4 : l4) {
			System.out.println("Nombre :  " + r4[0] + ", Localidad: " + r4[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query1 = em.createQuery("select e.nombre, e.alta " + " from EmpleadoEntity e",
				Object[].class);
		List<Object[]> l5 = query1.getResultList();
		for (Object[] r5 : l5) {
			System.out.println("Nombre: " + r5[0] + " - " + r5[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query2 = em.createQuery(
				"select e.nombre, e.alta " + " from EmpleadoEntity e" + " where UPPER(e.nombre) like '%CARRERA%'",
				Object[].class);
		List<Object[]> l6 = query2.getResultList();
		for (Object[] r6 : l6) {
			System.out.println("Nombre: " + r6[0] + " - " + r6[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query3 = em.createQuery("select e.nombre, e.oficio, e.departamento.nombre "
				+ " from EmpleadoEntity e" + " where e.oficio = 'Empleado'" + "and e.departamento.nombre = 'I+D'",
				Object[].class);
		List<Object[]> l7 = query3.getResultList();
		for (Object[] r7 : l7) {
			System.out.println("Nombre: " + r7[0] + " - " + r7[1] + " - " + r7[2]);
		}
		System.out.println();
		TypedQuery<Object[]> query4 = em.createQuery(
				"select e.nombre, e.alta " + " from EmpleadoEntity e " + " where YEAR(e.alta) >=2003", Object[].class);
		List<Object[]> l8 = query4.getResultList();
		for (Object[] r8 : l8) {
			System.out.println("Nombre: " + r8[0] + " - " + r8[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query5 = em.createQuery(
				"select e.nombre, e.empleados.nombre " + " from DepartamentoEntity e " + " order by e.nombre",
				Object[].class);
		List<Object[]> l9 = query5.getResultList();
		for (Object[] r9 : l9) {
			System.out.println("Nombre: " + r9[0] + " - " + r9[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query6 = em
				.createQuery("select e.departamento.nombre, count(e.nombre), sum(e.salario), max(e.salario) "
						+ " from EmpleadoEntity e " + " group by e.departamento.nombre", Object[].class);
		List<Object[]> l10 = query6.getResultList();
		for (Object[] r10 : l10) {
			System.out.println("Nombre: " + r10[0] + " - " + r10[1] + " - " + r10[2] + " - " + r10[3]);
		}
		System.out.println();
		TypedQuery<Object[]> query7 = em.createQuery(
				"select e.departamento.nombre, count(e.nombre), sum(e.salario), max(e.salario) "
						+ " from EmpleadoEntity e " + " group by e.departamento.nombre" + " having count(e.nombre) >=5",
				Object[].class);
		List<Object[]> l11 = query7.getResultList();
		for (Object[] r11 : l11) {
			System.out.println("Nombre: " + r11[0] + " - " + r11[1] + " - " + r11[2] + " - " + r11[3]);
		}
		System.out.println();
		TypedQuery<Object[]> query8 = em.createQuery(
				"select e.nombre, e.dirId.nombre, e.departamento.dptoId" + " from EmpleadoEntity e ", Object[].class);
		List<Object[]> l12 = query8.getResultList();
		for (Object[] r12 : l12) {
			System.out.println("Nombre: " + r12[0] + " - su jefe es - " + r12[1] + " - departamento - " + r12[2]);
		}
		System.out.println();
		TypedQuery<Object[]> query9 = em.createQuery("select d.nombre, count(d2) "
				+ " from DepartamentoEntity d join d.empleados d2 " + " group by d.nombre", Object[].class);
		List<Object[]> l13 = query9.getResultList();
		for (Object[] r13 : l13) {
			System.out.println("Nombre: " + r13[0] + " - " + r13[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query10 = em.createQuery("select d.nombre, count(d2) "
				+ " from DepartamentoEntity d left join d.empleados d2 " + " group by d.nombre", Object[].class);
		List<Object[]> l14 = query10.getResultList();
		for (Object[] r14 : l14) {
			System.out.println("Nombre: " + r14[0] + " - " + r14[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query11 = em.createQuery("select e.departamento.dptoId, e.nombre, e.salario "
				+ " from EmpleadoEntity e " + " order by e.salario desc, e.salario asc", Object[].class);
		List<Object[]> l15 = query11.getResultList();
		for (Object[] r15 : l15) {
			System.out.println("Nombre: " + r15[0] + " - " + r15[1] + " - " + r15[2]);
		}
		System.out.println();
		TypedQuery<Object[]> query12 = em.createQuery(
				"select e.empnoId, e.nombre " + " from EmpleadoEntity e " + " where e.dirId is null", Object[].class);
		List<Object[]> l16 = query12.getResultList();
		for (Object[] r16 : l16) {
			System.out.println("Nombre: " + r16[0] + " - " + r16[1]);
		}
		System.out.println();
		TypedQuery<Object[]> query13 = em.createQuery("select d.dptoId, d.nombre "
				+ " from DepartamentoEntity d left join d.empleados d2 " + " where 1039 member of d2.empnoId ",
				Object[].class);
		List<Object[]> l17 = query13.getResultList();
		for (Object[] r17 : l17) {
			System.out.println("Nombre: " + r17[0] + " - " + r17[1]);
		}
	}

	public int incrementarSalario(int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q = em.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n");
		q.setParameter("n", cantidad);
		cuenta = q.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int incrementarOficio(String oficio, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q = em.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n where oficio= :s");
		q.setParameter("n", cantidad);
		q.setParameter("s", oficio);
		cuenta = q.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int incrementarSalarioDepartamento(int numDepartamento, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q = em
				.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n where departamento.getDptoId()= :s");
		q.setParameter("n", cantidad);
		q.setParameter("s", numDepartamento);
		cuenta = q.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarEmpleado(int numEmpleado) {
		int cuenta;
		em.getTransaction().begin();
		Query q = em.createQuery("DELETE FROM EmpleadoEntityEj where empnoId= :n");
		q.setParameter("n", numEmpleado);
		cuenta = q.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarDepartamentoJPQL(int numDepartamento) {
		int cuenta;
		em.getTransaction().begin();
		Query q = em.createQuery("DELETE FROM DepartamentoEntityEj where dptoId= :n");
		q.setParameter("n", numDepartamento);
		cuenta = q.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

}
//--------------------------------------------------------------------------------------------------------------
