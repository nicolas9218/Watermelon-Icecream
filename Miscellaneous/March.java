class May {

    void month(){
        System.out.println("This is the month of May.");
    }
}

class June extends May {
    void month(){
        System.out.println("This is the month of June.");
    }
}

class march extends May{
    void month(){
        System.out.println("This is the month of March.");
    }

    public static void main(String[] args){
        may m = new May();
        may n = new June();
        may u = new March();
        m.month();
        n.month();
        u.month();
    }
}
