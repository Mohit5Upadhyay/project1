public class chandrayaan3 {

    private String name;
    private String opinion ; 
    public void setName(String name){
        this.name=name;
    }
    public void setOpinion(String opinion){
        this.opinion=opinion;
    }
    public String getName( ){
        return name;
    }
    public String getOpinion( ){
        return opinion;
    }
    public static void main(String[] args) {
        chandrayaan3 st = new chandrayaan3();
        st.setName("chandrayaan3");
        st.setOpinion("Yes , Successfull.");

        String name = st.getName();
        System.out.println(name);
        String opinion = st.getOpinion();
        System.out.println(opinion);


    }
}

