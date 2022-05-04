public class peliculas extends Multimedia {
	private String actorPrincipal;
	private String actrizPrincipal;

	public peliculas(String titulo, String autor, String formato, double duracion, String actorPrincipal,
			String actrizPrincipal) throws Exception {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
		if (this.actorPrincipal == null && this.actrizPrincipal == null) {
			throw new IllegalArgumentException("No se admiten los argumentos");
		}
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}

	@Override
	public String toString() {
		return super.toString() + "peliculas [actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal
				+ "]";
	}

}
