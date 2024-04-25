class Emp {
    private int empId;
    private String empName;

    Emp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Exp1 {
    public static void main(String args[]) {
        Emp obj = new Emp(110, "Avinash");
        int eid = obj.getEmpId();
        String ename = obj.getEmpName();
        System.out.println("Emp id is : " + eid + " Emp name is : " + ename);

		 Emp obj1 = new Emp(120, "Avin");
        int e1id = obj1.getEmpId();
        String e1name = obj1.getEmpName();
        System.out.println("Emp id is : " + e1id + " Emp name is : " + e1name);
 
    }
}
