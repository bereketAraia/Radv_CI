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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user51)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/a_View Submission'))

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_Title_h4_INV 1 Does the medical reco'), 
    2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_Title_h4_INV 1 Does the medical reco'), 
    'INV 1 Does the medical record correctly identify the sampled beneficiary?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/Header_Link_a_I would like to mark all as'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Name on coversheet does'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Name on coversheet does'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_ErrMsg_Error INV 1 requires a selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Name on coversheet does'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_No patient name on the r'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Patient name is the same'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Different patient name o'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV1_CommentBox_textarea_comment'), 'hello radv-INV 1 comment')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_TItle_h4_INV 3 Is the name on the me'), 
    2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_TItle_h4_INV 3 Is the name on the me'), 
    'INV 3 Is the name on the medical record an acceptable variance of the name of the sampled beneficiary?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_label_Name on record is the mi'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_label_Name on record is the mi'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_Error INV 3 requires a selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_label_Not an acceptable name v'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV3_CommentBox_textarea_comment'), 'hello radv-INV 3 comment')

'End of INV3 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_h4_INV 4 Is there a date on th'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_h4_INV 4 Is there a date on th'), 
    'INV 4 Is there a date on the Medical Record?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_No Date of Service on me'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_No Date of Service on me'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_ErrMsg_strong_Error INV 4 requires a'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_Year of service missing'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_No valid date of service'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV4_CommentBox_textarea_comment'), 'hello radv-INV 4 comment')

'End INV4 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_h5_You must make a selection.'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_h4_INV 14 Is the date on the m'), 
    'INV 14 Is the date on the medical record within the data collection period?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_label_Date of service outside'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_label_Date of service outside'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_Error_strong_Error INV 14 requires a selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_label_Other'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_label_Date of service outside'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV14_CommentBox_textarea_comment'), 'hello radv-INV 14 comment')

'End of INV14 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_h4_INV 5 Is the medical record'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_h4_INV 5 Is the medical record'), 
    'INV 5 Is the medical record from a valid source?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_Invalid Provider Type (R'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_Invalid Provider Type (R'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_strong_Error INV 5 requires a'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_Invalid Provider Type (R'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_Invalid Provider Source'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_No face-to-face document'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV5_CommentBox_textarea_comment'), 'hello radv-INV 5 comment')

'End of INV5 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_h4_INV 15 Does the Provider Type'), 
    2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_h4_INV 15 Does the Provider Type'), 
    'INV 15 Does the Provider Type of the medical record match the Provider Type selected on the Medical Record Coversheet?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_ObservationAmb surg reco'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_ObservationAmb surg reco'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_strong_Error INV 15 requires a'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_Overnight ER stay submit'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_Insufficient documentati'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_ObservationAmb surg reco'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV15_CommentBox_textarea_comment'), 'hello radv-INV 15 comment')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_h4_INV 2 Is the medical record'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_h4_INV 2 Is the medical record'), 
    'INV 2 Is the medical record signed?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_No valid signature in medical record'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_No valid signature in medical record'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_strong_Error INV 2 requires a'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_No valid signature in medical record - valid aatestation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_Signature stamps are not'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_No valid signature in med record - invalid attestation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV2_CommentBox_textarea_comment'), 'hello radv-INV 2 comment')

'End of INV2 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_h4_INV 7 Are you able to confi'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_h4_INV 7 Are you able to confi'), 
    'INV 7 Are you able to confirm an acceptable credential/specialty?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_No patient name on the r'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_No patient name on the r'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_strong_Error INV 7 requires a'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_Name on coversheet does'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_Different patient name o'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_CommentBox_textarea_comment'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV7_CommentBox_textarea_comment'), 'hello radv-INV 7 comment')

'End INV7 Section'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_h4_INV 20 Is the medical recor'), 
    2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_h4_INV 20 Is the medical recor'), 
    'INV 20 Is the medical record free from invalid issues not otherwise addressed through existing INV checks?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_CommentBox_textarea_comment'))

WebUI.delay(2)

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_CommentBox_textarea_comment'), 'hello radv-INV 20 comment')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/FinalSection_label_Provide any general comm'), 
    'Provide any general comments you may have about this submission. (Optional)')

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_CommentBox_textarea_comment'))

WebUI.delay(2)

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_7/INV20_CommentBox_textarea_comment'), 'Hello Radv- final comment box')

WebUI.delay(2)

