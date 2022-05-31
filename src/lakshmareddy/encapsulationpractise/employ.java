package lakshmareddy.encapsulationpractise;

public class employ {
    int basicsalary;
    int bonus;
    int dediction;
    int pf;
    int pt;

    int grosssalary(){;
        return basicsalary+bonus;
    }
    int netsalary (){
        return basicsalary+bonus-dediction-pf-pt;
    }
}
