package JavaLangPackage;

final class Immutableclass {
	
    private final int i;

    Immutableclass(int i) {
        this.i = i;
    }

    public Immutableclass modify(int i) {
    	if (this.i == i) {
    		 return this;
		} else {
			return (new Immutableclass(i));
		}   
    }

    public static void main(String[] args) {
    	Immutableclass im = new Immutableclass(10);
    	Immutableclass im2 = im.modify(130);
    	Immutableclass im3 = im.modify(20);
    	Immutableclass im4 = im.modify(10);
    	
    	System.out.println(im == im2);
    	System.out.println(im == im3);
    	System.out.println(im == im4);
	}
}
