// generated with ast extension for cup
// version 0.8
// 6/1/2019 20:8:14


package rs.ac.bg.etf.pp1.ast;

public class ImplementsClass extends Implements {

    private TypeList TypeList;

    public ImplementsClass (TypeList TypeList) {
        this.TypeList=TypeList;
        if(TypeList!=null) TypeList.setParent(this);
    }

    public TypeList getTypeList() {
        return TypeList;
    }

    public void setTypeList(TypeList TypeList) {
        this.TypeList=TypeList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TypeList!=null) TypeList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TypeList!=null) TypeList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TypeList!=null) TypeList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ImplementsClass(\n");

        if(TypeList!=null)
            buffer.append(TypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ImplementsClass]");
        return buffer.toString();
    }
}
