package exercise1.creational.sqlQueries;

public class SQLQueryBuilder {
    private StringBuilder query;
    public SQLQueryBuilder(){
        query = new StringBuilder();
    }
    public SQLQueryBuilder select(String table, String... fields){
        query.append("SELECT ");
        query.append(String.join(", ", fields));
        query.append(" FROM ").append(table);
        return this;
    }
    public SQLQueryBuilder where(String condition) {
        query.append(" WHERE ").append(condition);
        return this;
    }

    public SQLQueryBuilder orderBy(String field, String direction) {
        query.append(" ORDER BY ").append(field).append(" ").append(direction);
        return this;
    }

    public String build() {
        return query.toString();
    }
}
