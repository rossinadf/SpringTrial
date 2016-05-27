package cl.advise.test.model;

public class Cliente {
	   private Integer id;
	   private String nombre;
	   private String email;

	   public void setNombre(String nombre) {
	      this.nombre = nombre;
	   }
	   public String getNombre() {
	      return nombre;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	}