import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Tachograph{
    private Table<String, String, String> Table = HashBasedTable.create();

    public void store(String time, String position, String speed){
        Table.put(time, position, speed);
    }

    public boolean isEmpty(){
        return Table.isEmpty();
    }

}