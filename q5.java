 class Main {

    public static void main(String[] args) {

        SmartHome sh = new SmartHome();

        sh.monitorSecurity();
        sh.checkEnergyUsage();
    }
}

interface SecuritySystem {

    void monitorSecurity();
}

interface EnergySystem {

    void checkEnergyUsage();
}

class SmartHome implements SecuritySystem, EnergySystem {

    public void monitorSecurity() {

        System.out.println("Security is monitored");
    }

    public void checkEnergyUsage() {

        System.out.println("Energy check done");
    }
}