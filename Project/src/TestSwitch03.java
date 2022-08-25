/**
 * 测试Switch语句
 */
public class TestSwitch03 {
    public static void main(String[] args) {
        int a = 3;
        switch (a){
            case 3:
                System.out.println("3333");
                break;
            case 4:
                System.out.println("4444");
        }
        String huawei ="华为";
        switch (huawei){
            case "华为":
                System.out.println("爱国华为");
                break;
            case "联想":
                System.out.println("美帝良心");
                break;
            default:
                System.out.println("其他产品");
        }
    }
}
