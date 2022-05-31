package lakshmareddy.encapsulationpractise;

public class runneremploy {
    public static void main(String[] args) {
        employ lakshma=new employ();
        lakshma.basicsalary=18000;
        lakshma.bonus=7000;
        lakshma.pf=1800;
        lakshma.pt=200;
        lakshma.dediction=600;
        System.out.println(lakshma.netsalary());
        System.out.println(lakshma.grosssalary());

    }
}
