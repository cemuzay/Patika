package src.maceraoyunu;

public class Award  {
    private int id;
    private String name;

    public Award( int id,String name) {
        this.id = id;
        this.name = name;


    }
    public static Award[] awards(){
       Award awardlist[]=new Award[3];
       awardlist[0]=new Award(1,"Food");
       awardlist[1]=new Award(2,"firewood");
       awardlist[2]=new Award(3,"water");
       return awardlist;
    }
    public static Award getAwardobjbyid(int id){
        for(Award a:Award.awards()){
            if (a.getId()==id){
                return a;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

