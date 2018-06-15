package app;

import jello.model.JelloEntity;
import jello.annotation.KeyElement;
import jello.annotation.Required;
import jello.annotation.Attachment;
import jello.security.Accessible;
import jello.security.Role;
import jello.ux.Validation;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import com.google.appengine.api.datastore.Key;
import jello.annotation.Reference;

@PersistenceCapable
@Accessible( Role.ALL )
public class Product extends JelloEntity {

	private static final long serialVersionUID = -5666599484854869165L;

	@Expose
	@KeyElement
	public String SerialNumber;

	@Attachment(accept="image/*")
	@Expose
	public String image;

	@Expose
	@Required
	public String name;

	@Validation(min=0)
	@Expose
	public Double price;

	@Reference(Catagory.class)
	@Expose
	public Key catagory;




}
