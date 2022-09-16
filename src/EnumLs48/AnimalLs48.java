package EnumLs48;

public enum AnimalLs48 {
    DOG("KÖPEK"), CAT("KEDİ"), COW("İNEK"), BULL("BOĞA"), MOUSE("FARE");

    private String translation;

    private AnimalLs48(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString(){
        return "Türkçe çeviri - " + translation;
    }
}
