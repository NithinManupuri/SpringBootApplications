package in.spring.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.spring.service.ServiceTest;

@WebMvcTest(value = CodeReviewRest.class)
public class RestControllerTest {
	
	
	@MockBean
	private ServiceTest service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getMsgTest() throws Exception {
		when(service.getMsg()).thenReturn("Hello word");
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
		
	}
	
	
	
}
