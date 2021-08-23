package com.auto.test.entity;

import com.auto.test.enums.AgreementType;
import com.auto.test.enums.HeaderType;
import com.auto.test.enums.ParamType;
import com.auto.test.enums.RequestMethod;

/**
 * 保存接口请求实体类
 */
public class ApiRequestEntity {
    private Long id;

    private String apiName;

    private ApiUrlEntity apiUrl;

    private RequestMethod requestMethod;

    private ApiParamEntity apiParam;

    private ApiHeaderEntity apiHeader;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ApiUrlEntity getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(ApiUrlEntity apiUrl) {
        this.apiUrl = apiUrl;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public ApiParamEntity getApiParam() {
        return apiParam;
    }

    public void setApiParam(ApiParamEntity apiParam) {
        this.apiParam = apiParam;
    }

    public ApiHeaderEntity getApiHeader() {
        return apiHeader;
    }

    public void setApiHeader(ApiHeaderEntity apiHeader) {
        this.apiHeader = apiHeader;
    }

    public class ApiUrlEntity {
        private Long id;

        private AgreementType agreementType;

        private String domainName;

        private Integer port;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public AgreementType getAgreementType() {
            return agreementType;
        }

        public void setAgreementType(AgreementType agreementType) {
            this.agreementType = agreementType;
        }

        public String getDomainName() {
            return domainName;
        }

        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }

    public class ApiParamEntity{
        private Long id;
        private ParamType paramType;
        private String paramBody;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public ParamType getParamType() {
            return paramType;
        }

        public void setParamType(ParamType paramType) {
            this.paramType = paramType;
        }

        public String getParamBody() {
            return paramBody;
        }

        public void setParamBody(String paramBody) {
            this.paramBody = paramBody;
        }
    }

    public class ApiHeaderEntity{
        private Long id;
        private HeaderType headerType;
        private String headerBody;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public HeaderType getHeaderType() {
            return headerType;
        }

        public void setHeaderType(HeaderType headerType) {
            this.headerType = headerType;
        }

        public String getHeaderBody() {
            return headerBody;
        }

        public void setHeaderBody(String headerBody) {
            this.headerBody = headerBody;
        }
    }

}
