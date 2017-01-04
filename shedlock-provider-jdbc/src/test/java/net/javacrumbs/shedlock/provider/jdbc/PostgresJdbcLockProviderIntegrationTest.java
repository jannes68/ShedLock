package net.javacrumbs.shedlock.provider.jdbc;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

public class PostgresJdbcLockProviderIntegrationTest extends AbstractJdbcLockProviderIntegrationTest {
    private static final PostgresConfig dbConfig = new PostgresConfig();

    @BeforeClass
    public static void startDb() throws IOException {
        dbConfig.startDb();
    }

    @AfterClass
    public static void shutdownDb() {
        dbConfig.shutdownDb();
    }

    @Override
    protected DbConfig getDbConfig() {
        return dbConfig;
    }
}