package com.todaysoft.cpa.param;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @desc: cpa所需的参数
 * @author: 鱼唇的人类
 * @date: 2017/8/7 13:40
 */
@ConfigurationProperties(prefix = "api")
public class CPAProperties {
    private String authorization;
    private String geneUrl;
    private String geneName;
    private String geneTempPath;
    private String drugUrl;
    private String drugName;
    private String drugTempPath;
    private String variantUrl;
    private String variantName;
    private String variantTempPath;
    private String evidenceUrl;
    private String evidenceName;
    private String evidenceTempPath;
    private String proteinUrl;
    private String proteinName;
    private String proteinTempPath;
    private String clinicalTrialUrl;
    private String clinicalTrialName;
    private String clinicalTrialTempPath;
    private String mutationStatisticsUrl;
    private String mutationStatisticsName;
    private String mutationStatisticsTempPath;
    private String regimenUrl;
    private String regimenName;
    private String regimenTempPath;
    private int maxContentThreadNum;
    private int maxIdTreadNum;
    private long heartbeat;
    private int maxBlockingNum;
    private int maxFailureBlockingNum;

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getGeneUrl() {
        return geneUrl;
    }

    public void setGeneUrl(String geneUrl) {
        this.geneUrl = geneUrl;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public String getGeneTempPath() {
        return geneTempPath;
    }

    public void setGeneTempPath(String geneTempPath) {
        this.geneTempPath = geneTempPath;
    }

    public String getDrugUrl() {
        return drugUrl;
    }

    public void setDrugUrl(String drugUrl) {
        this.drugUrl = drugUrl;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugTempPath() {
        return drugTempPath;
    }

    public void setDrugTempPath(String drugTempPath) {
        this.drugTempPath = drugTempPath;
    }

    public String getVariantUrl() {
        return variantUrl;
    }

    public void setVariantUrl(String variantUrl) {
        this.variantUrl = variantUrl;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public String getVariantTempPath() {
        return variantTempPath;
    }

    public void setVariantTempPath(String variantTempPath) {
        this.variantTempPath = variantTempPath;
    }

    public String getEvidenceUrl() {
        return evidenceUrl;
    }

    public void setEvidenceUrl(String evidenceUrl) {
        this.evidenceUrl = evidenceUrl;
    }

    public String getEvidenceName() {
        return evidenceName;
    }

    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
    }

    public String getEvidenceTempPath() {
        return evidenceTempPath;
    }

    public void setEvidenceTempPath(String evidenceTempPath) {
        this.evidenceTempPath = evidenceTempPath;
    }

    public String getProteinUrl() {
        return proteinUrl;
    }

    public void setProteinUrl(String proteinUrl) {
        this.proteinUrl = proteinUrl;
    }

    public String getProteinName() {
        return proteinName;
    }

    public void setProteinName(String proteinName) {
        this.proteinName = proteinName;
    }

    public String getProteinTempPath() {
        return proteinTempPath;
    }

    public void setProteinTempPath(String proteinTempPath) {
        this.proteinTempPath = proteinTempPath;
    }

    public String getClinicalTrialUrl() {
        return clinicalTrialUrl;
    }

    public void setClinicalTrialUrl(String clinicalTrialUrl) {
        this.clinicalTrialUrl = clinicalTrialUrl;
    }

    public String getClinicalTrialName() {
        return clinicalTrialName;
    }

    public void setClinicalTrialName(String clinicalTrialName) {
        this.clinicalTrialName = clinicalTrialName;
    }

    public String getClinicalTrialTempPath() {
        return clinicalTrialTempPath;
    }

    public void setClinicalTrialTempPath(String clinicalTrialTempPath) {
        this.clinicalTrialTempPath = clinicalTrialTempPath;
    }

    public String getMutationStatisticsUrl() {
        return mutationStatisticsUrl;
    }

    public void setMutationStatisticsUrl(String mutationStatisticsUrl) {
        this.mutationStatisticsUrl = mutationStatisticsUrl;
    }

    public String getMutationStatisticsName() {
        return mutationStatisticsName;
    }

    public void setMutationStatisticsName(String mutationStatisticsName) {
        this.mutationStatisticsName = mutationStatisticsName;
    }

    public String getMutationStatisticsTempPath() {
        return mutationStatisticsTempPath;
    }

    public void setMutationStatisticsTempPath(String mutationStatisticsTempPath) {
        this.mutationStatisticsTempPath = mutationStatisticsTempPath;
    }

    public String getRegimenUrl() {
        return regimenUrl;
    }

    public void setRegimenUrl(String regimenUrl) {
        this.regimenUrl = regimenUrl;
    }

    public String getRegimenName() {
        return regimenName;
    }

    public void setRegimenName(String regimenName) {
        this.regimenName = regimenName;
    }

    public String getRegimenTempPath() {
        return regimenTempPath;
    }

    public void setRegimenTempPath(String regimenTempPath) {
        this.regimenTempPath = regimenTempPath;
    }

    public int getMaxContentThreadNum() {
        return maxContentThreadNum;
    }

    public void setMaxContentThreadNum(int maxContentThreadNum) {
        this.maxContentThreadNum = maxContentThreadNum;
    }

    public int getMaxIdTreadNum() {
        return maxIdTreadNum;
    }

    public void setMaxIdTreadNum(int maxIdTreadNum) {
        this.maxIdTreadNum = maxIdTreadNum;
    }

    public long getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(long heartbeat) {
        this.heartbeat = heartbeat;
    }

    public int getMaxBlockingNum() {
        return maxBlockingNum;
    }

    public void setMaxBlockingNum(int maxBlockingNum) {
        this.maxBlockingNum = maxBlockingNum;
    }

    public int getMaxFailureBlockingNum() {
        return maxFailureBlockingNum;
    }

    public void setMaxFailureBlockingNum(int maxFailureBlockingNum) {
        this.maxFailureBlockingNum = maxFailureBlockingNum;
    }
}
