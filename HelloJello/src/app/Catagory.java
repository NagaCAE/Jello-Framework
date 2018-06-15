package app;

import jello.model.JelloEntity;
import jello.annotation.KeyElement;
import jello.security.Accessible;
import jello.security.Role;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import java.util.List;
import javax.jdo.annotations.NotPersistent;
import jello.annotation.Association;

@PersistenceCapable
@Accessible( Role.ALL )
public class Catagory extends JelloEntity {

	private static final long serialVersionUID = -6345502363172876151L;

	@Expose
	@KeyElement
	public String name;

	@NotPersistent
	@Association(mappedBy="catagory")
	@Expose
	private List<Product> products;




}
