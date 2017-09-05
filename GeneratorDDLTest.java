import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.anxin.common.test.SpringTestCase;
import com.anxin.common.util.generator.GeneratorDDLMySQL;
import com.anxin.common.util.generator.GeneratorJavaBeanMySQL;
import com.anxin.o2o.entity.Member;


public class GeneratorDDLTest extends SpringTestCase{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void testGeneratorMapper() throws Exception {
		Class<Member> clazz = Member.class;
		GeneratorDDLMySQL.generatorMapper(clazz);
	}

	@Test
	public void testGeneratorJavaBean() throws Exception {
		GeneratorJavaBeanMySQL.generatorJavaBean(jdbcTemplate, "t_member", "Member");
	}
	
	
	@Test
	public void test1() throws Exception {
		test1("Member");werwe12
	}
	
	retertert
}
