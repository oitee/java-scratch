package Section8;

public class Printer {
    int tonerLevel;
    int pagesPrinted;
    boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
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

    public int printPages(int pages){
        if (duplex){
            pages = pages / 2;

        }
        pagesPrinted += pages;
        return pages;
    }
}
