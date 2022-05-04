import java.sql.Date;

public class Empleado {

	private int EMPNO;
	private String ENAME;
	private String JOB;
	private int MGR;
	private Date HIREDATE;
	private double SAL;
	private double COMM;
	private int DEPTNO;

	public Empleado() {

	}

	public Empleado(int eMPNO, String eNAME, String jOB, int mGR, Date hIREDATE, double sAL, double cOMM, int dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
	}

	/**
	 * @return the eMPNO
	 */
	public int getEMPNO() {
		return EMPNO;
	}

	/**
	 * @param eMPNO the eMPNO to set
	 */
	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}

	/**
	 * @return the eNAME
	 */
	public String getENAME() {
		return ENAME;
	}

	/**
	 * @param eNAME the eNAME to set
	 */
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	/**
	 * @return the jOB
	 */
	public String getJOB() {
		return JOB;
	}

	/**
	 * @param jOB the jOB to set
	 */
	public void setJOB(String jOB) {
		JOB = jOB;
	}

	/**
	 * @return the mGR
	 */
	public int getMGR() {
		return MGR;
	}

	/**
	 * @param mGR the mGR to set
	 */
	public void setMGR(int mGR) {
		MGR = mGR;
	}

	/**
	 * @return the hIREDATE
	 */
	public Date getHIREDATE() {
		return HIREDATE;
	}

	/**
	 * @param hIREDATE the hIREDATE to set
	 */
	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}

	/**
	 * @return the sAL
	 */
	public double getSAL() {
		return SAL;
	}

	/**
	 * @param sAL the sAL to set
	 */
	public void setSAL(double sAL) {
		SAL = sAL;
	}

	/**
	 * @return the cOMM
	 */
	public double getCOMM() {
		return COMM;
	}

	/**
	 * @param cOMM the cOMM to set
	 */
	public void setCOMM(double cOMM) {
		COMM = cOMM;
	}

	/**
	 * @return the dEPTNO
	 */
	public int getDEPTNO() {
		return DEPTNO;
	}

	/**
	 * @param dEPTNO the dEPTNO to set
	 */
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}

	@Override
	public String toString() {
		return "Empleado [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE="
				+ HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
	}

}
