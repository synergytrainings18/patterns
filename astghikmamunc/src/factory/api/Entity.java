package factory.api;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class Entity {

	private Integer id;

	private String metacategotyName;

	private String name;

	private Entity parent;

	public Entity(Integer id, String metacategotyName, String name, Entity parent) {
		this.id = id;
		this.metacategotyName = metacategotyName;
		this.name = name;
		this.parent = parent;
	}

	public String getMetacategotyName() {
		return metacategotyName;
	}

	public void setMetacategotyName(String metacategotyName) {
		this.metacategotyName = metacategotyName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entity getParent() {
		return parent;
	}

	public void setParent(Entity parent) {
		this.parent = parent;
	}
}
