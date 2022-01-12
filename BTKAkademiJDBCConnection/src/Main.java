import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        selectDemo();
        insertData();
        update();
        deleteData();
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            //Class.forName("org.postgresql.Driver");
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("country")));
                        /*resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region")));*/

                //System.out.println(resultSet.getString("country"));
            }
            System.out.println(countries.size());
            System.out.println("bağlantı başarılı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);

        } finally {

        }
    }
    public static void insertData()throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;/*PreparedStatement nedir? şimdi biz aşağıda paramaetreleri
        ekliyoruz ya INSERT INTO vasıtasıyla bu parametreler değişken olduğundan kullanıcıdan alırız.
        Kullanıcı ne verirse onu ekleriz*/
        ResultSet resultSet;
        try {
            //Class.forName("org.postgresql.Driver");
            connection = dbHelper.getConnection();
            String sql="INSERT INTO country(country) VALUES(?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"ULUKIŞLA");//manuel parametremiz.
            //VALUES içindeki "?" işaret burada değer var ve bunu kullanıcıdan alacağız anlamındadır.

            //statement = connection.prepareStatement("INSERT INTO country(country) VALUES('Çayırova')");
            int result=statement.executeUpdate();
            System.out.println("KAYIT EKLENDİ");
            System.out.println("bağlantı başarılı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);

        } finally {
            statement.close();
            connection.close();

        }

    }
    public static void update()throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            //Class.forName("org.postgresql.Driver");
            connection = dbHelper.getConnection();
            //String sql="UPDATE country SET country='ilhan' WHERE country='BOR'";
            String sql="UPDATE country SET country='ilhan' WHERE country=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"KAYALAR");
            int result=statement.executeUpdate();
            System.out.println("KAYIT GÜNCELLENDİ");
            selectDemo();
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);

        } finally {
            statement.close();
            connection.close();

        }
    }
    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            //Class.forName("org.postgresql.Driver");
            connection = dbHelper.getConnection();
            //String sql="UPDATE country SET country='ilhan' WHERE country='BOR'";
            String sql="DELETE FROM country where country_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,110);
            int result=statement.executeUpdate();
            System.out.println("KAYIT SİLİNDİ");
            selectDemo();
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);

        } finally {
            statement.close();
            connection.close();

        }
    }
}
