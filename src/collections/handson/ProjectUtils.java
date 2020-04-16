package collections.handson;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ProjectUtils {

	
	public static void main(String[] args) 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d1= new Date("16/5/2020");
		Date d2=new Date("16/7/2020");
		Project p1=new Project(1,"it",d1,d2);
		Project p2=new Project(2,"it",d1,d2);
		Project p3=new Project(3,"java",d1,d2);
		Project p4=new Project(4,"java",d1,d2);
		Project p5=new Project(5,"iot",d1,d2);
		Project p6=new Project(6,"iot",d1,d2);
		Project p7=new Project(7,"iot",d1,d2);
		Project p8=new Project(8,"web",d1,d2);
		Project p9=new Project(9,"web",d1,d2);
		Project p10=new Project(10,"web",d1,d2);

    Employ e1=new Employ(101,"abc",20000.00,"abc@gmail.com");
    Employ e2=new Employ(102,"def",20000.00,"def@gmail.com");
    Employ e3=new Employ(103,"ghi",30000.00,"ghi@gmail.com");
    Employ e4=new Employ(104,"jkl",30000.00,"jkl@gmail.com");
    Employ e5=new Employ(105,"mno",40000.00,"mno@gmail.com");
    Employ e6=new Employ(106,"pqr",40000.00,"pqr@gmail.com");
    Employ e7=new Employ(107,"stu",50000.00,"stu@gmail.com");
    Employ e8=new Employ(108,"vwx",50000.00,"vwx@gmail.com");
    Employ e9=new Employ(109,"yza",60000.00,"yza@gmail.com");
    Employ e10=new Employ(1010,"bcd",60000.00,"bcd@gmail.com");
    
    TreeMap<Project,Employ> map=new TreeMap<Project, Employ>();
        map.put(p1, e1);
        map.put(p2,e2);
        map.put(p3,e3);
        map.put(p4,e4);
        map.put(p5,e5);
        map.put(p6,e6);
        map.put(p7,e7);
        map.put(p8,e8);
        map.put(p9,e9);
        map.put(p10,e10);
        displayByProjectId(map);
        displayByProjectDomain(map);
	}
						
	private static void displayByProjectDomain(Map<Project, Employ> map) {
		Comparator<Project> pc=new Comparator<Project>() 
    	{
    		@Override
    		public int compare(Project o1,Project o2)
    		{
    			return o1.getDomain().compareTo(o2.getDomain());
    		}
		};
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(pc)).forEach(t->System.out.println(t));
    }
			

	private static void displayByProjectId(TreeMap<Project, Employ> map) {
		// TODO Auto-generated method stub
		TreeMap<Project,Employ> map1=new TreeMap<Project, Employ>();
    	map1.entrySet().stream().forEach(t->System.out.println(t));
    	System.out.println("by id");
		
	}

}
