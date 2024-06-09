package entities;

public class LaporanPanen {
    private String namapanen;
    private String beratpanen;

    public LaporanPanen(String namapanen, String beratpanen) {
        this.namapanen = namapanen;
        this.beratpanen = beratpanen;
    }

    public String getNamaPanen() {
        return namapanen;
    }

    public void setNamaPanen(String namapanen) {
        this.namapanen = namapanen;
    }

    public String getBeratPanen() {
        return beratpanen;
    }

    public void setBeratPanen(String beratpanen) {
        this.beratpanen = beratpanen;
    }

    @Override
    public String toString() {
        return namapanen;
    }
}
