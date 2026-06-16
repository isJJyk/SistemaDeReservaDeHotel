package sistema.entities;

import sistema.enums.FormaPag;

public class Hospede {

    private String cidade;
    private int quantity;
    private int in;
    private int out;
    private String but;
    private FormaPag paga;
    private int price;
    String[] hotel = new String[]{"Elefort", "Smork", "Monjy"};

    public Hospede(String cidade, int quantity, int in, int out, String but,FormaPag paga, int price) {
        this.cidade = cidade;
        this.quantity = quantity;
        this.in = in;
        this.out = out;
        this.but = but;
        this.paga = paga;
        this.price = price;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public String getBut() {
        return but;
    }

    public void setBut(String but) {
        this.but = but;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Hope() {
        boolean encontrado = false;

        if (this.but != null && this.but.equalsIgnoreCase("Elefort")) {
            encontrado = false;
        } else {
            for (int i = 0; i < hotel.length; i++) {
                if (this.but != null && this.but.equals(hotel[i])) {
                    encontrado = true;
                    break;
                }
            }
        }
        if (encontrado) {
            System.out.println("Disponível.");
        } else {
            System.out.println("Nenhum quarto disponível. (Retornando dinheiro...)");
            System.exit(0);
        }
    }

    public void valor() {
        System.out.println("Disconto: ");
        if (out - in >= 5) {
            System.out.println("Aplicado");
            System.out.println("Valor do Quarto $198");
            if (price == 198) {
                System.out.println("Reserva confirmada.");
            } else if (price > 198) {
                System.out.println("Reserva confirmada. (Retornando dinheiro)");
            } else {
                System.out.println("Falha ao pagar.");
            }
        } else {
            System.out.println("Não aplicado");
            if (price == 220) {
                System.out.println("Reserva confirmada.");
            } else if (price > 220) {
                System.out.println("Reserva confirmada. (Retornando dinheiro)");
            } else {
                System.out.println("Falha ao pagar.");
            }
        }
    }
}