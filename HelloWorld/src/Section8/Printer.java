package Section8;

public class Printer {
    int tonerLevel;
    int pagesPrinted;
    boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if(tonerLevel < 0 || tonerLevel > 100){
            tonerLevel = 0;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempTonerLevel = tonerLevel + tonerAmount;
        if (tempTonerLevel < 0 || tempTonerLevel > 100){
            return -1;
        }
        tonerLevel = tempTonerLevel;
        return tonerLevel;
    }

    public void printPages(int pages){
        if (duplex){
            pages = pages / 2;
            System.out.println("Duplex");

        }
        System.out.println("Printing " + pages + " ...");
        pagesPrinted += pages;
    }
}
