import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.password_mrrc_QA)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/button_Validate'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/button_a_View Submission'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_A non-CMS-Generated Atte'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_No Attestation'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/label_A CMS-Generated Attestat'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_No medical record (INV 1'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_A medical record'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_No medical record (INV 1'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_A medical record'))

WebUI.scrollToElement(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/a_I would like to mark all as'), 
    3)

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/a_I would like to mark all as'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_No medical record (INV 1'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_A medical record'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Page_RADV CDAT/label_No medical record (INV 1'))

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/textarea_medicalRecordComment'), 'comment no medical record')

WebUI.closeBrowser()

