package mobi;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by olivier on 24.11.16.
 */
public class ConstituateMedicalConditions implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(ConstituateMedicalConditions.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        Optional firstName = Optional.ofNullable(execution.getVariable("var_firstName"));
        Optional lastName = Optional.ofNullable(execution.getVariable("var_secondName"));

        LOGGER.info(new StringBuffer().append(firstName.orElse("NONE")).append(lastName.orElse("NONE")).toString());

        execution.setVariable("var_naissance", LocalDate.now());
    }
}
