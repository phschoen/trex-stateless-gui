package com.exalttech.trex.ui.controllers.dashboard.filters;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import com.exalttech.trex.util.Initialization;


public class DashboardStream extends HBox {
    @FXML
    private Label label;

    private final int pgid;
    private final EventHandler<Event> onAddClicked;

    public DashboardStream(final int pgid, final EventHandler<Event> onAddClicked) {
        Initialization.initializeFXML(this, "/fxml/Dashboard/filters/DashboardStream.fxml");

        this.pgid = pgid;
        this.onAddClicked = onAddClicked;
        label.setText(String.format("PG ID - %d", pgid));
    }

    public int getPGId() {
        return pgid;
    }

    @FXML
    public void handleAddClicked(final MouseEvent event) {
        if (onAddClicked != null) {
            onAddClicked.handle(new Event(this, null, null));
        }
    }
}
