public class GovernmentContributions {

    // Attributes
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagIbigNumber;

    // Constructor

    public GovernmentContributions(String sssNumber, String philhealthNumber, String tinNumber, String pagIbigNumber) {
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagIbigNumber = pagIbigNumber;
    }

    // Getters and setters

    public String getSssNumber() {
        return sssNumber;
    }

    public void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    public String getPhilhealthNumber() {
        return philhealthNumber;
    }

    public void setPhilhealthNumber(String philhealthNumber) {
        this.philhealthNumber = philhealthNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getPagIbigNumber() {
        return pagIbigNumber;
    }

    public void setPagIbigNumber(String pagIbigNumber) {
        this.pagIbigNumber = pagIbigNumber;
    }

    // Other methods

    public String getContributionsInfo() {
        return String.format("SSS No: %s, PhilHealth No: %s, TIN No: %s, Pag-Ibig No: %s", sssNumber, philhealthNumber, tinNumber, pagIbigNumber);
    }
}

