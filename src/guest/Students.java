package guest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
		private String name;
		private String number;
		public Student(String name, String number) {
			this.name = name;
			this.number = number;
		}
		

		public int hashCode() {
			int hash =7;
			hash = 47*hash + Objects.hashCode(this.name);
			hash = 47*hash + Objects.hashCode(this.number);
			return hash;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj == null)
				return false;
			if(getClass() != obj.getClass())
				return false;
			final Student other = (Student) obj;
			if (!Objects.equals(this.name, other.name)) 
				return false;
			if (!Objects.equals(this.number, other.number)) 
				return false;
		 return true;
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("(%s %s)",name,number);
		}	
	
}
public class Students{
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("Harry","A163186214"));
		set.add(new Student("Bugy","H145684631"));
		set.add(new Student("Harry","A163186214"));
		System.out.println(set);
	}
}
