/**
 * @Title Position.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14;

/**
 * @ClassName Position
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * 
 */
class Position {
	private String title;
	private Person person;
	public Position(String jobTitle, Person employee){
		title = jobTitle;
		person = employee;
		if(person == null)
			person = Person.NULL;
	}
	public Position(String jobTitle){
		title = jobTitle;
		person = Person.NULL;
	}
	public String getTitle(){ return title; }
	public void setTitle(String newTitle){ title = newTitle; }
	public Person getPerson(){ return person; }
	public void setPerson(Person newPerson){
		person = newPerson;
		if(person == null)
			person = Person.NULL;
	}
	public String toString(){
		return "Position: " + title + " " + person;
	}
}
