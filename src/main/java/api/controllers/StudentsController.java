package api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/customers/{customerId}/accounts")
public class StudentsController {
	@Autowired
	AccountApplicationService accountApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;
	
	@RequestMapping(method = RequestMethod.POST, path = "", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> create(@PathVariable("customerId") long customerId, @RequestBody BankAccountDto bankAccountDto) throws Exception {
        try {
        	bankAccountDto = accountApplicationService.create(customerId, bankAccountDto);
            return new ResponseEntity<Object>(bankAccountDto, HttpStatus.OK);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
			return this.responseHandler.getAppExceptionResponse();
		}
    }
	
	/** @RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json; charset=UTF-8")
    @ResponseBody
    ResponseEntity<Object> get(@PathVariable("customerId") long customerId) {
        try {
            List<BankAccountDto> customers = accountApplicationService.get(customerId);
            return this.responseHandler.getDataResponse(customers, HttpStatus.OK);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
			return this.responseHandler.getAppExceptionResponse();
		}
    } **/
}
