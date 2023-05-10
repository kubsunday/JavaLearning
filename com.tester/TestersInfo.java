public class TestersInfo {

    public static void main(String[] args) {
        
        TestersTemplate kowalczyk = new TestersTemplate();
        kowalczyk.name = "Janek";
        kowalczyk.surname = "Kowalczyk";
        kowalczyk.position = "Junior";
        kowalczyk.payRate = 28;

        TestersTemplate niedziela = new TestersTemplate();
            niedziela.name = "Jakub";
            niedziela.surname = "Niedziela";
            niedziela.position = "Mid";
            niedziela.payRate = 30;

        TestersTemplate kubanski = new TestersTemplate();
        kubanski.name = "Kacper";
        kubanski.surname = "Kubański";
        kubanski.position = "Senior";
        kubanski.payRate = 40;

        TestersTemplate wiejak = new TestersTemplate();
        wiejak.name = "Patryk";
        wiejak.surname = "Wiejak";
        wiejak.position = "Junuir";
        wiejak.payRate = 30;
        
        TestersTemplate hertynski = new TestersTemplate();
        hertynski.name = "Antoni";
        hertynski.surname = "Hertyński";
        hertynski.position = "MiD";
        hertynski.payRate = 26;

        TestersTemplate[] testerlist = new TestersTemplate[5];
            
            testerlist[0] = kowalczyk;
            testerlist[1] = niedziela;
            testerlist[2] = kubanski;
            testerlist[3] = wiejak;
            testerlist[4] = hertynski;

        int i=0;

        while (i<testerlist.length){
            testerlist[i].personalData();
            testerlist[i].companyData();
            i++;
        }



        



        
    }
    
}
