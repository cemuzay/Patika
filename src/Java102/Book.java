package src.Java102;

public class Book {
    private String name;
    private  int pagenumber;
    public Book(String name,int pagenumber){
        if(pagenumber<0){
            pagenumber=0;
        }
        this.name=name;
        this.pagenumber=pagenumber;
    }
    public int getPagenumber(){

        return this.pagenumber;
    }
    public int setPagenumber(int pagenumber){
        this.pagenumber=pagenumber;
        return this.pagenumber;
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        this.name=name;
        return this.name;
    }
}
