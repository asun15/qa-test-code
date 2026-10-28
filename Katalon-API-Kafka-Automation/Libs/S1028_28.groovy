import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import java.util.UUID
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.llm.keyword.contribution.LlmDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


import com.katalon.execution.application.ExecutionMain

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.llm.keyword.contribution.LlmDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/kp/7drp_rs90p9608hhrqhlp7100000gn/T/Katalon/Test Cases/KAFKA_001_Consume_Message/20261028_140044_457/execution.properties')

TestCaseMain.beforeStart()

new ExecutionMain().init();

Map<String, String> tcProperties = new HashMap<String, String>();

def __tcBinding = new TestCaseBinding('Test Cases/KAFKA_001_Consume_Message', [:])
if (__tcBinding != null) { __tcBinding.setTestCaseExecutionId(UUID.fromString('5f977bd6-37f8-45d4-9ebb-884b0b77d060')) }


        TestCaseMain.runTestCase('Test Cases/KAFKA_001_Consume_Message', __tcBinding, FailureHandling.STOP_ON_FAILURE , false, tcProperties)
    
