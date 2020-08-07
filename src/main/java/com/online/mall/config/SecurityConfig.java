package com.online.mall.config;

import com.online.mall.config.authHandler.FuryAuthFailureHandler;
import com.online.mall.config.authHandler.FuryAuthSuccessHandler;
import com.online.mall.config.authHandler.MyLogoutSuccessHandler;
import com.online.mall.config.authHandler.RestAuthAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @ClassName SecurityConfig
 * @Create by Cai on 2020/7/7 12:29
 **/

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    /**
     * 依赖注入自定义的登录成功处理器
     */
    @Autowired
    private FuryAuthSuccessHandler furyAuthSuccessHandler;
    /**
     * 依赖注入自定义的登录失败处理器
     */
    @Autowired
    private FuryAuthFailureHandler furyAuthFailureHandler;
    /**
     * 依赖注入自定义的注销成功的处理器
     */
    @Autowired
    private MyLogoutSuccessHandler myLogoutSuccessHandler;


    /**
     * 注册没有权限的处理器
     */
    @Autowired
    private RestAuthAccessDeniedHandler restAuthAccessDeniedHandler;

    /***注入自定义的CustomPermissionEvaluator*/
//    @Bean
//    public DefaultWebSecurityExpressionHandler webSecurityExpressionHandler() {
//        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
//        handler.setPermissionEvaluator(new AdminPermissionEvaluator());
//        return handler;
//    }
//
//    /***注入我们自己的登录逻辑验证器AuthenticationProvider*/
//    @Autowired
//    private AuthenticationProvider authenticationProvider;



    @Bean
    @Override
    protected UserDetailsService userDetailsService() {

        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails userDetails = User.withUsername("zhangsan").password(passwordEncoder.encode("123456")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(userDetails);

    }

    //configure配置自定义拦截规则
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/admin/login/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()

                .and()
                //form表单认证
//            .formLogin()
//                .loginPage("/login.html")
//                .loginProcessingUrl("/login")
//                .successHandler(furyAuthSuccessHandler)
//                .failureHandler(new AuthenticationFailureHandler() {
//                    @Override
//                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
//                                                        HttpServletResponse httpServletResponse,
//                                                        AuthenticationException e)
//                            throws IOException, ServletException {
//                        // do something
//                        System.out.println("login failed!");
//
//                    }
//                })
//                .permitAll()
//                .and()
                .csrf().disable();
//
    }

}
