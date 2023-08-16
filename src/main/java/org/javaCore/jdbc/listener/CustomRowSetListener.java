package org.javaCore.jdbc.listener;

import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

@Log4j2
public class CustomRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command EXECUTE triggered.");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row INSERTED, UPDATED or DELETED.");
        if (event.getSource() instanceof RowSet) {
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursor moved.");
    }
}
