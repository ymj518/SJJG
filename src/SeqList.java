import java.util.Arrays;

public class SeqList<T> extends Object {
    protected Object[] element;    //对象数组存储顺序表的数据元素，保护成员
    protected int n;    //顺序表元素个数
    public SeqList(int length) {   //构造容量为length的空表
        this.element=new Object[length];    //申请数组的存储空间
        this.n=0;
    }
    public SeqList(T[]values) {    //创建顺序表，由valus数组提供元素
        this(values.length);
        for(int i=0;i<values.length;i++) {
            this.element[i]=values[i];
            this.n=element.length;
        }
    }
    public boolean isEmpty() {  //判断顺序表是否空，若为空则返回true
        return this.n==0;

    }
    public int size() {    //返回顺序表元素个数
        return this.n;
    }
    public T get(int i) {    //返回第i个元素，0《=0《1，若i越界，则返回null
        if(i>=0&&i<this.n)
            return (T)this.element[i];    //返回数组元素引用的对象，传递对象引用
        return null;
    }
    public void set(int i,T x) {
        if(x==null)
            throw new NullPointerException("x==null");    //抛出空对象异常
        if(i>=0&&i<this.n)
            this.element[i]=x;
        else throw new java.lang.IndexOutOfBoundsException(i+" ");    //抛出符号越界异常
    }
    @Override
    public String toString() {
        return "SeqList [element=" + Arrays.toString(element) + ", n=" + n + ", isEmpty()=" + isEmpty() + ", size()="
                + size() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String values[]= {"A","B","c","D","E"};
        SeqList<String>lista=new SeqList<String>(values);
//        SeqList<Integer>listl=new SeqList<Integer>();
}
}