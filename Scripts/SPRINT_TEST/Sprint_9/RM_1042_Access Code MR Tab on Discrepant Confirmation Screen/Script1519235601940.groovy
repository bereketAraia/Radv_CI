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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc3user14)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_h1_Discrepant Confirmation'), 
    'Discrepant Confirmation')

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Coversheet ID CY YYYY Contract'), 
    2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_CHIC'), 2)

'1042.1'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_RRBHIC'), 
    2)

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_a_View Submission'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_Validate'))

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_Exit'), 1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_Escalate'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_Saving_Save'), 
    1)

'1042.2'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_Complete'), 
    1)

'1042.3'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/Text_h2_Audited CMS-HCCs that CMS expects'), 
    0)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_HCC-XXXXXX'), 0)

WebUI.click(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_HCC-XXXXXX'))

'1042.4'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/Text_List of Codes_p_4400 4401 44020 44021 44022'), 
    2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/Text_h4_For CY13 HCC105 is part of'), 
    2)

'1042.5'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/button_Open Encoder Tool'), 
    0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/label_No ICD-9 codes found in'), 
    2)

'1042.6'
WebUI.click(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/label_No ICD-9 codes found in'))

'1042.7'
//WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_Validate_Tab/textarea_form_NoICD-9-control ng-untou'), 2)

