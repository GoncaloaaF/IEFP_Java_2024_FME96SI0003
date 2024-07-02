public class Endereco {
    /*
    {
         "сер": "31270901",
        "city": "Belo Horizonte",
        "neighborhood": "Pampulha",
        "service": "correios",
        "state": "MG",
        "street": "Av. Presidente Antônio Carlos, 6627"
    }
     */
   private String сер;
   private String city;
   private String neighborhood;
   private String service;
   private String state;
   private String street;

    public Endereco(String сер, String city, String neighborhood, String service, String state, String street) {
        this.сер = сер;
        this.city = city;
        this.neighborhood = neighborhood;
        this.service = service;
        this.state = state;
        this.street = street;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getСер() {
        return сер;
    }

    public void setСер(String сер) {
        this.сер = сер;
    }
}
