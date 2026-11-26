package modifie;

public class ClientVehicules {
    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();
        AbstractFactory factoryHybride = new FactoryHybride();

        Automobile automobile = null;
        Scooter scooter = null;

        System.out.println("Utilisation de la fabrique Essence");
        automobile = factoryEssence.construireAutomobile();
        scooter = factoryEssence.construireScooter();
        automobile.methodeAutomobile();
        scooter.methodeScooter();

        System.out.println("\nUtilisation de la fabrique Electrique");
        automobile = factoryElectrique.construireAutomobile();
        scooter = factoryElectrique.construireScooter();
        automobile.methodeAutomobile();
        scooter.methodeScooter();

        System.out.println("\nUtilisation de la fabrique Hybride");
        automobile = factoryHybride.construireAutomobile();
        scooter = factoryHybride.construireScooter();
        automobile.methodeAutomobile();
        scooter.methodeScooter();
    }
}