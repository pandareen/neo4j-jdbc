/**
 * Copyright (c) 2016 LARUS Business Automation [http://www.larus-ba.it]
 * <p>
 * This file is part of the "LARUS Integration Framework for Neo4j".
 * <p>
 * The "LARUS Integration Framework for Neo4j" is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 03/02/16
 */
package it.neo4j.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;

/**
 * @author AgileLARUS
 * @since 3.0.0
 */
public abstract class Statement implements java.sql.Statement {

	@Override public abstract ResultSet executeQuery(String sql) throws SQLException;

	@Override public abstract int executeUpdate(String sql) throws SQLException;

	@Override public abstract void close() throws SQLException;

	@Override public int getMaxFieldSize() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setMaxFieldSize(int max) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getMaxRows() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setMaxRows(int max) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setEscapeProcessing(boolean enable) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getQueryTimeout() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setQueryTimeout(int seconds) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void cancel() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public SQLWarning getWarnings() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void clearWarnings() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setCursorName(String name) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean execute(String sql) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public ResultSet getResultSet() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getUpdateCount() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean getMoreResults() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setFetchDirection(int direction) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getFetchDirection() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setFetchSize(int rows) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getFetchSize() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getResultSetConcurrency() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getResultSetType() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void addBatch(String sql) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void clearBatch() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int[] executeBatch() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public Connection getConnection() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean getMoreResults(int current) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public ResultSet getGeneratedKeys() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int executeUpdate(String sql, String[] columnNames) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean execute(String sql, String[] columnNames) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public int getResultSetHoldability() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean isClosed() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void setPoolable(boolean poolable) throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean isPoolable() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public void closeOnCompletion() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public boolean isCloseOnCompletion() throws SQLException {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override public <T> T unwrap(Class<T> iface) throws SQLException {
		return Wrapper.unwrap(iface, this);
	}

	@Override public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return Wrapper.isWrapperFor(iface, this.getClass());
	}
}
