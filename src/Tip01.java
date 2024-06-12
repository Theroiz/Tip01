public class Tip01 
{
    public static void main(String[] args) 
    {
       Calculator calc = new Calculator();
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double person1 = 10, person2 = 12, person3 = 9, person4 = 8, person5 = 7, person6 = 15, person7 = 11, person8 = 30;
        System.out.println("person 1: R$"+calculo(10,5,15));
        System.out.println("person 2: R$"+calculo(12,5,15));
        System.out.println("person 3: R$"+calculo(9,5,15));
        System.out.println("person 4: R$"+calculo(8,5,15));
        System.out.println("person 5: R$"+calculo(7,5,15));
        System.out.println("person 6: R$"+calculo(15,5,15));
        System.out.println("person 7: R$"+calculo(11,5,15));
        System.out.println("person 8: R$"+calculo(30,5,15));
        //10*0.20 para tirar %
        //imposto 5%, gorgeta 15%
    }    
    public static double calculo(double person,double imposto, double taxa)
    {
        person += (person*((imposto+taxa)/100));
        return person;
    }
}