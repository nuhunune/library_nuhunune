class FacSearch{
  int[] indexes;
  int[] facts;
  int length;
  //lengthは10まで!
  public FacSearch(int length){
    this.length=length;
    indexes=new int[length];
    facts=new int[length+1];
    facts[0]=1;
    for(int i=0;i<n;i++){
      indexes[i]=i;
      facts[i+1]=facts[i]*(i+1);
    }
    
  }
  void update(){
    for(int i=0;i<length-1;i++){
      if(indexes[i]>indexes[i+1]){
        swap(i);
        break;
      }else{
        swap(i);
      }
    }
  }
  void swap(int index){
    int tmp;
    tmp=indexes[index];
    indexes[index]=indexes[index+1];
    indexes[index+1]=tmp;
  }
}
