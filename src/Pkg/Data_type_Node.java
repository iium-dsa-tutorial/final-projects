package Pkg;

/**
 * Created by gimy on 12/12/2016.
 */
public class Data_type_Node extends SqlStatementNode{

    private String Data_type;

    public Data_type_Node(String data_type) {
        Data_type = data_type;
    }

    public String get_Data_type() {
        return Data_type;
    }

    @Override
    public int getType() {
        return SqlStatementNode.Data_type_Node;
    }
}
