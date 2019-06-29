class Mods {
    int mod;
    int[] fact;
    //modは十分大きい素数にすること!
    public Mods(int len,int mod){
        fact=new int[len+1];
        fact[0]=fact[1]=1;
        this.mod=mod;
        for(int i=2;i<=len;i++){
            fact[i]=fact[i-1]*i%mod;
        }
    }
    int modSum(int a,int b){
        return (int)(((long)a+(long)b)%mod);
    }
    int modMult(int a,int b){
        return (int)(((long)a*(long)b)%mod);
    }
    int pow2(int a,int times){
        if(times==0)return a;
        else return pow2((int)((long)a*(long)a%mod),times-1);
    }
    int modPow(int a,int b){
        int output=1;
        if(b==0)return 1;
        for(int i=0;i<Math.log(b)/Math.log(2)+1;i++){
            if((b&(int)Math.pow(2, i))>0){
                output=modMult(pow2(a,i),output);
            }
        }
        return output;
    }
    int modNCR(int n,int r){
        if(n<r)return 0;
        if(n==r)return 1;
        return modMult(fact[n],modPow(r,mod-2));
    }
}
