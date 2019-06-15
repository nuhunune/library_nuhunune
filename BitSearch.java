class BitSearch{
    int length;
    int bottom;
    int[] bits;
    public BitSearch(int length,int bottom){
        this.length=length;
        this.bottom=bottom;
        bits=new int[length];
    }
    int getbit(int index){
        return bits[index];
    }
    void update(int index){
        if(++bits[index]==bottom){
            bits[index]=0;
            update(index+1);
        }
    }
}
