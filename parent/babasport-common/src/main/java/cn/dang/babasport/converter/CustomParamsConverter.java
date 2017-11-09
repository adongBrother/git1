package cn.dang.babasport.converter;

import org.springframework.core.convert.converter.Converter;

public class CustomParamsConverter implements Converter<String, String> {

	
	/**
	 * 去空格
	 */
	@Override
	public String convert(String source) {
		if(source !=null && !"".equals(source)){
			source=source.trim();
			//如果我们输入的是一组空格
			if(!"".equals(source)){
				return source;
			}
		}
		return null;
	}

}
