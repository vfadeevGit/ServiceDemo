package com.company.servicedemo.screen.serviceinquiry;

import com.company.servicedemo.entity.ServiceInquiryJob;
import io.jmix.bpmui.processform.ProcessFormContext;
import io.jmix.bpmui.processform.annotation.ProcessForm;
import io.jmix.bpmui.processform.annotation.ProcessVariable;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Component;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.ServiceInquiry;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("ServiceInquiry.edit")
@UiDescriptor("service-inquiry-edit.xml")
@EditedEntityContainer("serviceInquiryDc")
@ProcessForm
public class ServiceInquiryEdit extends StandardEditor<ServiceInquiry> {
    @Install(to = "jobListTable.unit", subject = "columnGenerator")
    private Component jobListTableUnitColumnGenerator(ServiceInquiryJob serviceInquiryJob) {
        return new Table.PlainTextCell(serviceInquiryJob.getJob().getUnit().name());
    }

    @ProcessVariable
    protected ServiceInquiry editedInquiry;

    @Autowired
    protected ProcessFormContext processFormContext;

    @Subscribe
    public void onInit(InitEvent event) {
        setEntityToEdit(editedInquiry);
    }

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        commitChanges()
                .then(() -> {
                    processFormContext.taskCompletion()
                            .complete();
                    //closeWithDefaultAction();
                });
    }

}